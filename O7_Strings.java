public class O7_Strings {
  public static void main(String[] args) {
    String name = "Abhishek";
    System.out.println(name + "Krishna");
    System.out.println(name.charAt(1));

    String s1 = "ak";
    String s2 = "ak";
     
    System.out.println(s1==s2);
    s1=s1+" ck";
    System.out.println(s1 + " "+ s2);
    System.out.println(s1==s2);
    // System.out.println(name[0]);
    System.out.println(name.length());
    for(int i =0;i<name.length();i++){
      System.out.println(name.charAt(i));

    }
    StringBuffer sb=new StringBuffer("abhishek");
    System.out.println(sb+" "+sb.length());
    sb.append("Krishna");
    System.out.println(sb);
    System.out.println(sb.getClass().getName());
    String str = sb.toString();
    System.out.println(str + " "+str.getClass().getName());


  }
}
