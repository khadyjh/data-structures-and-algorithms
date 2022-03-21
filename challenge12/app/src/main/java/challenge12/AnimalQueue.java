package challenge12;

import challenge12.AnimalShelter.AnimalShelter;
import challenge12.AnimalShelter.Cat;
import challenge12.AnimalShelter.Dog;

public class AnimalQueue {
   private Queue<AnimalShelter> dogQueue;
   private Queue<AnimalShelter> catQueue;

    public AnimalQueue() {
        dogQueue=new Queue<>();
        catQueue=new Queue<>();
    }

    public void enqueue(AnimalShelter animalShelter){
        if(animalShelter instanceof Dog){
            dogQueue.enqueue(animalShelter);
        }else if(animalShelter instanceof Cat){
            catQueue.enqueue(animalShelter);
        }else {
            throw new IllegalArgumentException();
        }

    }

    public AnimalShelter dequeue(String type){
        if(type.equals("dog")){
            return dogQueue.dequeue();
        }else if(type.equals("cat")){
            return catQueue.dequeue();
        }
        return null;
    }

    @Override
    public String toString() {
        return "AnimalQueue{" +
                "dogQueue=" + dogQueue +
                ", catQueue=" + catQueue +
                '}';
    }
}
