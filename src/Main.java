public class Main {
    public static void main(String[] args) {
     //Animal деген класс тузунуз жана бир метод кошунуз.
        //Анын 3 наследнигин тузунуз.
        //
        //Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
        //Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин
        //кошунуз.
        //instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
        //чыгарыныз.
        //Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
        //болуп оз озунун массивине салыныз.
        Animal animal=new Animal();
        Animal shark=new Shark();
        Animal eagle=new Animal();
        Animal turtle=new Animal();
        Animal[]animals={shark,eagle,turtle};
     for (Animal animal1 = animals) {
         if(animal1 instanceof Shark){
             ((Shark)animal1).attack();
         }
else if (animal1 instanceof  Animal){
             ((Animal)animal1).metod();
         }
         else    if (animal1 instanceof  Eagle){
             ((Eagle)animal1).fly();
            }
         else if (animal1 instanceof Turtle){
             ((Turtle)animal1).swim();
         }
     }





    }
}