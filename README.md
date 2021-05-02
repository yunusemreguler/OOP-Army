# OOP-Army
OOP-Army is a project to show how great SOLID principles are. 

Keeping these principles in mind while coding provides us code which is ready for future implementations, 
easy to expend, organized and uses full potential of Object Oriented Programming. 

You can think of this project as a mini-game which uses only terminal to interact. In this game
there are different types of soldiers and they have skills such as attacking defensing and so on.
You will be the commander of an army and command your soldiers as you wish. Sounds like a great example
to understand SOLID.

## Soldier
There are attributes which are common for all types of soldiers such as name, attackPoint etc.
Also they have common behaviors like attack, defense etc. 
Why don't we just create an abstract class called Soldier and put these common attributes and
behaviors into it. Then when ever we create a new type of soldier we can just extend this class
and it will be so much easier to expand it.

`public abstract class Soldier`

Now lets create a soldier type called Archer and extend the Soldier class.

`public class Archer extends Soldier`

By doing this, you will inherit all abilities and behaviors of Soldier class. Override the methods 
specific to the Archer class. Also you can add additional attributes for archers such as throwingPoint.

Create another type of soldier called Cavalry and extend Soldier class. Go over the same steps
and Override the methods specific to the Cavalry class. Here is the great part. attack() function is
inherited from soldier class, both Cavalry and Archer class have it but they are implemented
class specific. You will call the same function attack() but the outputs will differ.

Let's have a look at Commander class. They will need extra behaviors than a soldier, in order to
command the army they are leading. So create an interface with those extra functions and 
also implement the interface and override the methods.

`public class Commander extends Soldier implements CommanderBehaviour`

Finally create a class called Army which has a commander and a list of soldiers.

## How to run

Just clone the repository and run the main function in `Main.class`.

## Let's Experiment

After finishing the POJO's lets make some experiments. First of all, I created a class called
ArmyManager to handle plumbing stuff which are CreatingArmy and printAttributes. This class will
be used for its functions so we don't need extra instances of this class. Make it a singleton so 
be sure that there is only one instance of it.

In the main class create an army by just calling the armyManager.

`Army army = manager.createArmy();`

When creating an army we can easily create a `List<Soldier>` and put all types of soldiers(Archer,
Cavalry, Swordsman) into it. Because all of them inherited Soldier class and at the end of the day
they are just simply soldiers.

You are the commander so let's give some orders. For example, `commandToAttack(List<Soldier>)` function
is gets a list of soldiers and commands them to attack. What is actually happening inside this function ? Here it is

`    
         soldiers.forEach(Soldier::attack);
`

It seems really neat doesn't it. So in the soldiers list there are all kinds of soldiers. 
But thanks to OOP each different type invokes it own implementation of `attack()` function. 
What if I want to create a new type of soldier ? Just extend the Soldier class and throw
it into the list. You don't need to change any code.

## Conclusion

For the future of any project which includes OOP must follow SOLID principles.
I hope this little project helps people to understand OOP and SOLID more.
