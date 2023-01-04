class Person  {
    private String fullName;
    private int age;
    public Person(){
        this.fullName = "";
        this.age = 0;
    }
    public Person(String fullName,int age){
        this.fullName=fullName;
        this.age=age;
    }
    public void move() {
        System.out.println(fullName + " is moving.");
    }
    public void talk() {
        System.out.println(fullName + " is talking.");
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

