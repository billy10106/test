package gittest;

class Animal {
	private int age;
    private int weight;
     
    public Animal(int a, int w) {
    	
    	setAge(a);
    	setWeight(w);
        System.out.println("�ϥΨ�ӰѼƪ��غc�l�AAnimal����w�إ�....");
  
    }
     
    public Animal(int w) {
        this(3, w);
    }
     
    public Animal() {
        this(3, 15);
    }
     
     
    public int getAge() {
        return age;
    }
 
    public void setAge(int n) {
        if (n < 0) {
            age = 1;
        }
        else {
            age = n;
        }
    }
     
    public int getWeight() {
        return weight;
    }
     
    public void setWeight(int n) {
        if (n < 0) {
            weight = 1;
        }
        else {
            weight = n;
        }
    }
     
    public void speak() {
        System.out.println("���o�A�ڤw�g" + getAge() + "���A��" + getWeight() + "���筫");
    }
}

 class JungleDemo3 {
    public static void main(String[] args) {
       Animal puppy1 = new Animal(6, 70);
        puppy1.speak();
       
        Animal puppy2 = new Animal(142);
        puppy2.speak();
         
     Animal puppy3 = new Animal();
    puppy3.speak();
    }
}
 
