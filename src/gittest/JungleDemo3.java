package gittest;

class Animal {
	private int age;
    private int weight;
     
    public Animal(int a, int w) {
    	
    	setAge(a);
    	setWeight(w);
        System.out.println("使用兩個參數的建構子，Animal物件已建立....");
  
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
        System.out.println("哈囉，我已經" + getAge() + "歲，有" + getWeight() + "公斤重");
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
 
