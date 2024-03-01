class Student {
    int[] marks = new int[3];
    String name;

    public Student(String n,int a,int b,int c) {
        name = n;
        marks[0] = a;
        marks[1] = b;
        marks[2] = c;
  
}
  

     int avg() {
        int avg = (55+65+75)/3;
        return avg;

   
    }

    public static void main(String[] args) {

        Student s = new Student("Sam", 55, 65, 75);

        System.out.println("Average marks : " + s.avg());

          }
 
  } 