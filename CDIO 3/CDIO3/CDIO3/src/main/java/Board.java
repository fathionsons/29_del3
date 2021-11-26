public class Board {
    int burgerBar, pizza, chance1, candyShop, iceShop, jailVisit, museum;
    int library, chance2, scooterPark, swimmingPool , parking, gamingHall;
    int cinema, chance3, toyShop, animalShop, jail, bowlingHall, zoo, chance4;
    int waterLand, beach;

    public Board() {
        burgerBar = 150;
        pizza = -100;
        chance1 = 150;
        candyShop = -20;
        iceShop = 160;
        jailVisit = 0;
        museum = -80;
        library= 90;
        chance2 = -60;
        scooterPark = -50;
        swimmingPool = 550;
        parking = 0;
        gamingHall = 25;
        cinema = 70;
        chance3 = 300;
        toyShop = -90;
        animalShop = 120;
        jail = -500;
        bowlingHall = 100;
        zoo = -30;
        chance4 = -20;
        waterLand = 80;
        beach = 200;
    }

    public int getFelt(int sum){

        if(sum == 2) {
            System.out.println("Du er i burgerbaren.");
            return burgerBar;
        } else if(sum == 3){
            System.out.println("Den koster -100 for en alm pizza");
            return pizza;
        } else if(sum == 4){
            System.out.println("Tillykke, du har fået 150 pointer");
            return chance1;
        } else if(sum == 5){
            System.out.println("Slik koster -20");
            return candyShop;
        } else if(sum == 6){
            System.out.println("WOW, du kan lide is !!, selvom den er dyr!");
            return iceShop;
        } else if(sum == 7){
            System.out.println("Nåhhh, Du er i fængsel");
            return jailVisit;
        } else if(sum == 8){
            System.out.println("Museet koster penge disse dage XD");
            return museum;
        } else if(sum == 9){
            System.out.println("Det er godt , at man prøver at være dannet.");
            return library;
        } else if(sum == 10){
            System.out.println("nejjj... Tag chancen igen.");
            return chance2;
        } else if(sum == 11){
            System.out.println("Tillykke med pointene, indtil videre");
            return scooterPark;
        } else if(sum == 12){
            System.out.println("HOLD DA OP");
            return swimmingPool;
        }
        else if(sum == 13){
            System.out.println("Stille og roligt, du må gerne tage en pause her");
            return parking;
        }
        else if(sum == 14){
            System.out.println("Du kan betale og spille masse af spil , HYG DIG !");
            return gamingHall;
        }
        else if(sum == 15){
            System.out.println("Ja hvorfor ikke? Se den nyeste film.");
            return cinema;
        }
        else if(sum == 16){
            System.out.println("Du er SÅ HELDIG!!!!!!!");
            return  chance3;
        }
        else if(sum == 17){
            System.out.println("Vil du købe nogle legetøj til dine børn?");
            return  toyShop;
        }
        else if(sum == 18){
            System.out.println("Du har købt et dyrt dyr!");
            return  animalShop;
        }
        else if(sum == 19){
            System.out.println("NEJJJJJJJJ!!");
            return   jail;
        }
        else if(sum == 20){
            System.out.println("KOM SÅ!");
            return bowlingHall;
        }
        else if(sum == 21){
            System.out.println("DYR DYR DYR!");
            return zoo;
        }
        else if(sum == 22){
            System.out.println("Det gør ikke ondt!");
            return chance4;
        }
        else if(sum == 23){
            System.out.println("Tillykke med pointene :)");
            return waterLand;
        }
        else if(sum == 24){
            System.out.println("Vi har en dejlig strand");
            return beach;
        }
        System.out.println("ukent terningværdi:" + sum);
        return 0;
    }

}

