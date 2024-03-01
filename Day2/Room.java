class Room {
  int h, w, b;

 public Room(int p, int q, int r){
    h=p;
    w=q;
    b=r;
}



public static void main(String agrs[]){

Room r= new Room(1,2,3);
  
System.out.println("Volume : "+r.volume());

}

 public int volume() {
   return h*w*b;
}
   }