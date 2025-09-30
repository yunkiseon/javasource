package object;

public class Car {
    // 속성 : 제조사명(현대), 모델명(아반떼), 색상(red), 최대속도(200)
    String companyName;
    String model;
    String color;
    int maxSpeed;

    void forward() {
        System.out.println(this.model + " 전진한다 ");
    }

    void backward() {
        System.out.println(this.model + " 후진한다 ");
    }

    void turn() {
        System.out.println(this.model + " 회전한다 ");
    }

    // 생성자-클래스명과 동일, 여러 개 작성 가능
    // 리턴 값이 없다. (void 사용하지 않음에도)
    // 괄호 안에 아무것도 없는(매개 변수가 없는) 것을 default(기본) 생성자
    // default 생성자의 특징 : 컴파일러가 자동으로 추가, 단 클래스에 정의된 생성자가 하나도 없는 경우
    // 생성자 오버로딩 : 하나의 클래스에 여러 개의 생성자 존재
    // 메소드 오버로딩 : 하나의 클래스에 여러 개의 메소드 존재
    Car() {

    }

    public Car(String companyName) {
        this.companyName = companyName;
    }

    public Car(String companyName, String model) {
        this.companyName = companyName;
        this.model = model;
    }
    // public Car(String companyName, String color) {// company나 color 등이 중복되선 안된다는
    // 것이 아닌, 타입이 같아선 안된다는 뜻
    // this.companyName = companyName;
    // this.color = color;
    // }

    public Car(String companyName, String model, String color) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
    }

    public Car(String companyName, String model, String color, int maxSpeed) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // public Car(String companyName, String model, int maxSpeed, String color) {
    // this.companyName = companyName;
    // this.model = model;
    // this.color = color;
    // this.maxSpeed = maxSpeed;
    // }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car [companyName=" + companyName + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
                + "]";
    }

}
