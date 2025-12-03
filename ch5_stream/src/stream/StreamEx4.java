package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("file3.txt"), new File("file3.txt"));
        List<File> list = List.of(new File("file1.txt"), new File("file2.txt"), new File("file3.txt"), new File("file3.txt"));
        // map() : 스트림 요소에 저장된 값 중에서 원하는 필드만 추출
        // stream.map(nullFunction<? super File,? extends R> mapper) : Function<t,r> 을 기억하자
        Stream<String> names = stream.map((f)->f.getName());
        names.forEach(System.out::println);
        
        // 리스트를 파일명만 추출해서 하나의 리스트로 변환
        List<String>  nameList = new ArrayList<>();
        for (File f : list) {
            nameList.add(f.getName());
        }
        System.out.println(nameList);
        // 같은 결과값이지만 map을 쓰는 것이 더 짧고 간결하다.


        // 대문자 변환
        List<String> list2 = List.of("abc","def","apple","melon","text");
        for (String string : list2) {
            System.out.println(string.toUpperCase());
        }
        Stream<String> stream2 = Stream.of("abc","def","apple","melon","text");
        // stream2.map((s)->s.toUpperCase()).forEach(s->System.out.println(s)); 아래와 동일
        stream2.map(String::toUpperCase).forEach(System.out::println);

        // filter : 조건에 안 맞는 요소 제외
        List<String> list3 = List.of("바둑", "바나나","포도", "딸기", "바질", "강아지");
        // 바로 시작하는 요소 출력

        for (String string : list3) {
            if (string.startsWith("바")) {
                System.out.println(string);
            }
        }
        //스트림으로 하면
        Stream<String> stream3 = list3.stream();
        // stream3.filter((s)->s.startsWith("바"))
        // .forEach(s->System.out.println(s));//Predicate<? super String> predicate 아래와 동일
        stream3.filter((s)->s.startsWith("바")).forEach(System.out::println);



        // student 이 로 시작하는 학생 출력
        List<Student> list4 = new ArrayList<>();
        list4.add(new Student("홍길동", 98));
        list4.add(new Student("김길동", 95));
        list4.add(new Student("박길동", 76));
        list4.add(new Student("이길동", 38));

        for (Student student: list4) {
            if (student.getName().startsWith("이")) {
                System.out.println(student);
            }
        }



        Stream<Student> stream4 = Stream.of(new Student("홍길동", 98), new Student ("김길동", 95), new Student("박길동", 76),
                new Student("이길동", 38));
        // stream4.filter(s->s.getName().startsWith("이")).forEach(System.out::println);
        stream4.map(Student::getName).filter(s->s.startsWith("이")).forEach(System.out::println);//위와 동일

        IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0).forEach(System.out::println);
        // for (int j = 1; j < 21; j++) { 위와 동일
        //     if (j%2==0) {
        //         System.out.println(j);
        //     }
        // }
        // distinct : 중복제거
        Stream<String> stream5 = Stream.of("바둑", "바나나","포도", "딸기", "바둑", "바질", "강아지");
        stream5.distinct().forEach(System.out::println);
        Stream<File> stream6 = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("Ex1"), new File("Ex2.bak")
        , new File("Test.java"));
        // txt,bak, java 만 나왔으면 하고 txt가 두번 안나왔으면 좋겠다. 
        File file = new File("Arr.java");
        System.out.println(file.getName()); 
        // 확장자만 추출하는 기능이 없기에... 아래와 같은 공정을 거쳐야 함.
        String fileName = file.getName();
        System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
        
        // 하지만 stream을 사용하면(indexof는 false 값이 -1 임)
        // 해석하자면 이름만 추출, 확장자가 있는 이름만 추출, substring으로 . 이후 글자들만 추출, 중복제거->출력인 것이다.
        stream6.map(File::getName).peek(f->System.out.printf("이름만 %s\n", f))
        .filter(f->f.lastIndexOf(".") > -1).peek(f->System.out.printf(" 확장자가 있는 이름 %s\n", f))
        .map(f->f.substring(f.lastIndexOf(".")+1)).peek(f->System.out.printf("확장자만 %s\n", f))
        .distinct()
        .forEach(System.out::println);
        
        // peek : 중간연산 확인용 위에 추가함

        // skip, limit
        Stream<String> stream7 = Stream.of("바둑", "바나나","포도", "딸기", "바질", "강아지");
        stream7.skip(2).limit(3).forEach(System.out::println); //포도 딸기 바질

        // collect 어떤 방식으로 수집할 지 적어야 함. list etc...
        Stream<Student> stream8 = Stream.of(new Student("홍길동", 98), 
        new Student ("김길동", 95), 
        new Student("박길동", 76),
        new Student("이길동", 38));
        // 점수만 모아서 새로운 리스트 변환
        // List<Integer> list5 = stream8.map(s->s.getJumsu()).collect(Collectors.toList()); 아래와 동일
        List<Integer> list5 = stream8.map(Student::getJumsu).collect(Collectors.toList());
        System.out.println(list5);
        long count = IntStream.rangeClosed(1, 10).filter(i->i% 2 == 0).count();
        System.out.println("2의 배수 개수 "+ count);
        OptionalDouble avg = IntStream.rangeClosed(1, 10).filter(i->i% 2 == 0).average();
        System.out.println("2의 배수 평균 "+ avg);
        int sum = IntStream.rangeClosed(1, 10).filter(i->i% 2 == 0).sum();
        System.out.println("2의 배수 총합 "+ sum);
        OptionalInt max = IntStream.rangeClosed(1, 10).filter(i->i% 2 == 0).max();
        System.out.println("2의 배수 최대값 "+ max);
        OptionalInt min = IntStream.rangeClosed(1, 10).filter(i->i% 2 == 0).min();
        System.out.println("2의 배수 최대값 "+ min);
    }
}
