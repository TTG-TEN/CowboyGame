void main() {

Character[] characters = {new Cowboy(), new Bandit(), new Sheriff()};



for (Character character : characters) {
    character.shoot();
    character.move();
    System.out.println("========================");
}



}
