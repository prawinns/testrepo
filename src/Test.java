interface I1{
int getLenght(String s);
}


class Test{
 public static void main(String[] args) {
  I1 i =  s -> s.length();
  System.out.println(i.getLenght("Barkha"));

 }
}