import java.time.*;

public class Giorno2altro {
    public static void main(String[] args) {
    LocalDate now = LocalDate.now();
        System.out.println(now);
    stampaMese(now);
        stampaStagione(now);

    }
    public static void stampaMese(LocalDate date)
    {

        System.out.println(date.getDayOfMonth()+" - "+date.getMonth()+" - "+date.getYear());
    }
    public static void stampaStagione(LocalDate date)
    {
int mon=date.getMonthValue();

        switch (mon)
        {
            case 1:
                System.out.println("inverno");
                break;
                case 2:
                    System.out.println("inverno");
                    break;
                    case 3:
                        System.out.println("Primavera");
                        break;
                        case 4:
                            System.out.println("Primavera");
                            break;
                            case 5:
                                System.out.println("Primavera");
                                break;
                                case 6:
                                    System.out.println("Estate");
                                    break;
                                    case 7:
                                        System.out.println("Estate");
                                        break;
                                        case 8:
                                            System.out.println("Estate");
                                            break;
                                            case 9:
                                                System.out.println("Autumno");
                                                break;
                                                case 10:
                                                    System.out.println("Autumno");
                                                    break;
                                                    case 11:
                                                        System.out.println("Autumno");
                                                        break;
                                                        case 12:
                                                            System.out.println("Inverno");
                                                            break;
                                                            default:
                                                                System.out.println("chi sa?");
                                                                break;
        }
    }




}
