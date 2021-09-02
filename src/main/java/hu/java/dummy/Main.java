package hu.java.dummy;

import hu.java.dummy.entities.Tank;
import hu.java.dummy.repositories.TankRepository;

public class Main {

    public static void main(String[] args) {
        tankDemo();
    }

    private static void tankDemo(){
        TankRepository repository = new TankRepository();
        int size = repository.selectAll().size();
        if (size == 0){
            for (int i = 0; i < 10; i++) {
                Tank tank = new Tank();
                tank.setName("Almafa 1" + i);
                repository.save(tank);
            }
        }

        repository.selectAll().forEach(tank -> {
            StringBuilder builder = new StringBuilder();
            builder.append("Name: ").append(tank.getName());
            builder.append(" Id: ").append(tank.getId());

            System.out.println(builder.toString());
        });
    }
}
