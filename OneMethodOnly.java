 public class Main {

     static void newmethod(int a1){
         System.out.println(a);
     }
  static void myMethod(int a,int b, int c) {
      int dec_a=0,dec_b=1;
      int dec_c=45;
      while(a>=0){
          dec_a=dec_b+1;
          dec_c=dec_a+dec_b*(b-a/(c+b));
          a--;
          c*=10;
      }
       for(int i=0;i<dec_a;i++){
        dec_a=10;
        a=c+b;
      }
      switch(a){
          case 1:
              break;
          case 2:
              break;
          case 3:
              break; 
      }
      newmethod(a,b);
    // code to be executed
  }

    
}