public class Main {
    public static void main(String[] args){
        Boss boss = new Boss();
        boss.setHealth(60);
        boss.setDamage(7);
        boss.setMachineGun(14);
        System.out.println("BOSS");

        System.out.println("Health:" + " " +  boss.getHealth() );
        System.out.println("Damage:" + " " +  boss.getDamage() );
        System.out.println("MachineGun:" + " " +  boss.getMachineGun() );

        System.out.println((boss.printInfo()));
        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setDamage(7);
        skeleton.setNumberOfArrows(5);
        skeleton.setHealth(55);
        skeleton.setHealth(4);
        System.out.println("Skeleton");
        System.out.println(skeleton.printInfo());
    }
}