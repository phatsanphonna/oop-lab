package lab06.question1;

public class SeniorProgrammer extends Programmer {

    public void coding(String str) {
        if (super.getEnergy() >= 10) {
            System.out.printf("I'm coding about %s\n", str);
        } else {
            System.out.println("ZzZzZz");
        }
        super.setEnergy(super.getEnergy() - 5);
        super.setHappiness(super.getHappiness() - 5);
    }

    public void coding(char str) {
        if (super.getEnergy() >= 10) {
            System.out.printf("I'm coding about %c\n", str);
        } else {
            System.out.println("ZzZzZz");
        }
        super.setEnergy(super.getEnergy() - 5);
        super.setHappiness(super.getHappiness() - 5);
    }

    public void coding(String str, int num) {
        for (int i = 0; i < num; i++) {
            if (super.getEnergy() >= 10) {
                System.out.printf("I'm coding about %s\n", str);
            } else {
                System.out.println("ZzZzZz");
            }
            super.setEnergy(super.getEnergy() - 5);
            super.setHappiness(super.getHappiness() - 5);
        }
    }

    public void compliment(Programmer p) {
        p.setHappiness(p.getHappiness() + 20);
        System.out.printf("%s in a good mood\n", p.getName());
    }

    public void blame(Programmer p) {
        p.setHappiness(p.getHappiness() - 20);
        System.out.printf("%s in a bad mood\n", p.getName());
    }
}
