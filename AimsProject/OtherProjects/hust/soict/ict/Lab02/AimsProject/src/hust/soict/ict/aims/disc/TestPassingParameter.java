package hust.soict.ict.aims.disc;
public class TestPassingParameter {
    public static void main(String[] args)
    {
        DigitalVideoDisc jungleDVD=new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD=new DigitalVideoDisc("Cinderella");
        swap(jungleDVD,cinderellaDVD);
        System.out.println("jungle dvd title: "+jungleDVD.getTitle());
        System.out.println("cinderella dvd title: "+cinderellaDVD.getTitle());
        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: "+jungleDVD.getTitle());

    }
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
    {
        DigitalVideoDisc dvd=dvd1;
        dvd1=dvd2;
        dvd2=dvd;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title)
    {
        String oldTitle=dvd.getTitle();
        dvd.setTitle(title);
        dvd= new DigitalVideoDisc(oldTitle);
    }
}
