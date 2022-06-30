public class fact {
    public static void main(String[] args) {
       switch(args.length){
            case 1:
                int n=Integer.parseInt(args[0]);
            int f=1;
            for(int i=1;i<=n;i++){
                f=f*i;
            }
            System.out.println(f);
            break;

           case 2:
            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            int n3= Math.abs(n1-n2);
            int f1=1;
            for(int i=1;i<=n3;i++){
                f1=f1*i;
            }
            System.out.println(f1);
            break;
           default:
               System.out.println("Error");
        }
    }
}
