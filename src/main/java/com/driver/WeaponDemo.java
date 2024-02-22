package com.driver;

import java.util.Scanner;

public class WeaponDemo {

   public static class Weapon {
        private final String weaponName;
        private int damage;
        private int range;

        public Weapon(String weaponName, int damage, int range) {
            this.weaponName = weaponName;
            setDamage(damage);
            setRange(range);
        }

        public String getWeaponName() {
        	//your code goes here
            return weaponName;
        }

        public int getDamage() {
        	//your code goes here
            return damage;
        }

        public void setDamage(int damage) {
        	//your code goes here
        }

        public int getRange() {
        	//your code goes here
            return range;
        }

        public void setRange(int range) {
        	//your code goes here
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weapon name: ");
        String weaponName = scanner.nextLine();

        int damage;
        do {
            System.out.print("Enter weapon damage (1-100): ");
            damage = scanner.nextInt();
        } while (damage < 1 || damage > 100);

        int range;
        do {
            System.out.print("Enter weapon range (1-500): ");
            range = scanner.nextInt();
        } while (range < 1 || range > 500);

        Weapon userWeapon = new Weapon(weaponName, damage, range);

        System.out.println("Weapon Details:");
        System.out.println("Name: " + userWeapon.getWeaponName());
        System.out.println("Damage: " + userWeapon.getDamage());
        System.out.println("Range: " + userWeapon.getRange());
    }
}

