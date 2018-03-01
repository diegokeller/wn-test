Package organization: one package for the game, subdivided in two packages, one for the character related classes and other for the weapon related classes.

Weapon is an abstract class with concrete subclasses. This allows the implementation of a default behavior when the weapon is fired (used) and also allows the customization on each weapon, when needed, through the method overload technique.

Character is an abstract class with concrete subclasses. The common behavior is developed in the Character class, allowing the character to attack and change weapons. The current weapon and the weapon iterator allow the character to change to the next weapon available on the list. The character subclasses allow the developer to completely change or just increment the behavior for a specific character through method override or overload respectively.

CharacterSet and WeaponSet store the set of characters and weapons that the player can choose. They are static to allow theyer access from anywhere, and also because there is only one set of characters and weapons in the game.

Player have a name and the character chosen. It also has methods corresponding to the buttons presses by the player when interacting with the game. When a button is pressed, one action is executed.

