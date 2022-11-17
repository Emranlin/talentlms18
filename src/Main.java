public class Main {
    public static void main(String[] args) {
        Person person=new Person("Zhiidegul",29,"zhiide@gamil.com");
        Person person1=new Person("Lira",38,"lira@gamil.com");
        Person person2=new Person("Meerim",39,"meka@gamil.com");
        Person person3=new Person("Nuriza",19,"nuriza@gamil.com");
        Person person4=new Person("Alibek",20,"ali@gamil.com");
        Person person5=new Person("Kutman",21,"kut@gamil.com");
        Person person6=new Person("Eliza",19,"eliza@gamil.com");
        Person person7=new Person("Ilim",20,"ilim@gamil.com");
        Person person8=new Person("Nuradil",19,"nuradil@gamil.com");
        Person[]guest={person,person1};
        Person[] family={person2,person3,person4,person5};
        Person[]people={person6,person7,person8};

        Apartment hotel=new Hotel("Rixon","Ibraimova 63",100,guest);
        System.out.println("Hotel");
        hotel.pay();
        System.out.println(hotel.live());
        Apartment flat=new Flat("Ihlas","Lev Tolstoi",10,family);
        System.out.println("Flat");
        flat.pay();
        System.out.println(flat.live());
        Apartment socialBehavior=new SocialBehavior("Hostes","Razakova 62",60,people);
        System.out.println("Social Behavior");
        socialBehavior.pay();
        System.out.println(socialBehavior.live());
    }
}