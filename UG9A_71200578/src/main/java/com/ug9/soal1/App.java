package com.ug9.soal1;


public class App 
{
    public static void main( String[] args ) {
        Lina lina = new Lina();
        DragonKnight dragonKnight = new DragonKnight();
        LegionCommander legionCommander = new LegionCommander();

        lina.skill(dragonKnight);
        dragonKnight.skill();
        dragonKnight.attack(lina);
        dragonKnight.attack(lina);
        legionCommander.skill(lina);
        lina.skill(legionCommander);

        lina.showCharacterInfo();
        dragonKnight.showCharacterInfo();
        legionCommander.showCharacterInfo();
    }
}
