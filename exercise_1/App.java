public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        Weapon shortsword = new Weapon();

        shortsword.name = "The Violator";
        shortsword.damage = 237;
        shortsword.weight = 3;
        shortsword.rarity = "Legendary";
        shortsword.weaponDescription();

        Weapon stavesWeapon = new Weapon();

        stavesWeapon.name = "Dragon Priest Staff";
        stavesWeapon.damage = 0;
        stavesWeapon.weight = 8;
        stavesWeapon.rarity = "Rare";
        stavesWeapon.weaponDescription2();

        Weapon bow = new Weapon();

        bow.name = "Nightingale Bow";
        bow.damage = 149;
        bow.weight = 15;
        bow.rarity = "Unique";
        bow.weaponDescription3();
    }
}
