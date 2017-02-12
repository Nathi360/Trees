import java.util.Scanner;

public class Testing
{
    public static int intro()
    {
        System.out.println("\n=====================================");
        System.out.println(" B I N A R Y - S E A R C H - T R E E");
        System.out.println("=====================================");

        System.out.println("\nOperations: \n");
        System.out.println("\t1. I N S E R T");
        System.out.println("\t2. R E M O V E");
        System.out.println("\t3. T R A V E R S A L");
        System.out.print("\t4. E X I T \t\t\t\tS E L E C T: ");

        Scanner pint = new Scanner(System.in);

        return pint.nextInt();
    }

    public static int traverse()
    {
        System.out.println("\nOptions: \n");
        System.out.println("\t1. I N - O R D E R");
        System.out.println("\t2. P R E - O R D E R");
        System.out.print("\t3. P O S T - O R D E R \t\t\t\tS E L E C T: ");

        Scanner pint = new Scanner(System.in);

        return pint.nextInt();
    }

    public static void main(String[] args)
    {
        Boolean runnin = true;
        Tree morula = new Tree();
        Scanner v = new Scanner(System.in);

        do
        {
            switch(intro())
            {
                case 1:
                {
                    System.out.print("\nN O D E - V A L U E: ");
                    morula.insert(v.nextInt());
                    break;
                }
                case 2:
                {
                    System.out.print("\nR E M O V E: ");
                    morula.delete(v.nextInt());
                    break;
                }
                case 3:
                {
                    Boolean state = true;

                    switch(traverse())
                    {
                        case 1:
                        {
                            morula.inOrder();
                            break;
                        }
                        case 2:
                        {
                            morula.preOrder();
                            break;
                        }
                        case 3:
                        {
                            morula.postOrder();
                            break;
                        }
                        default:
                        {
                            state = false;
                            System.out.println("\nInvalid Selection, terminating!");
                        }
                    }

                    break;
                }
                case 4:
                {
                    runnin = false;
                    System.out.println("\nTerminating Session: Bye!");
                    break;
                }
                default:
                {
                    runnin = false;
                    System.out.println("\nInvalid Selection, terminating!");
                }
            }
        } while(runnin);
    }
}
