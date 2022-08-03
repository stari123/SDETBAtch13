package review13;

        //see MapDemo and MapDemo1 for this class

public class Person {
    String id;
    String name;
    int age;
    String job;

    //Create constructor: shortcut; right click>generate>constructor>choose what fields u want> ok.
    public Person(String id, String name, int age, String job) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
    }

    //Create getter-setter methods: shortcut; right click>generate>getter and setter>choose the fields u want> ok.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    //Override; write to and choose public String tostring (generate via wizard) > cohose the fieldsu want>ok.
            @Override
            public String toString() {
                return "Person{" +
                        "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        ", job='" + job + '\'' +
                        '}';
            }
        }

