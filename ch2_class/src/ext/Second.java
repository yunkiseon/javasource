package ext;

import exam.Parent;//다른 패키지에 있는 클래스 사용할 때

public class Second extends Parent {
    Parent parent = new Parent();

    public void info() {
        // super.name = "성춘향";//not visible
        super.grade = "B";
        parent.getNum1();
    }

}
