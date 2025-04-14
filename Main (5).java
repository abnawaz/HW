class Owner:
    def __init__(self, name, phone):
        self.name = name
        self.phone = phone

    def __str__(self):
        return f"Owner: {self.name}, Phone: {self.phone}"


class Pet:
    def __init__(self, name, age, owner: Owner):
        self.name = name
        self.age = age
        self.owner = owner

    def make_sound(self):
        return "Some generic animal sound"

    def show_info(self):
        return f"{self.name} is {self.age} years old.\n{self.owner}"


class Dog(Pet):
    def make_sound(self):
        return "Woof!"

    def fetch(self):
        return f"{self.name} runs to fetch the ball."


class Cat(Pet):
    def make_sound(self):
        return "Meow!"

    def scratch(self):
        return f"{self.name} scratches the post."


# === Main Program ===
def main():
    owner1 = Owner("Alice", "555-1234")
    owner2 = Owner("Bob", "555-5678")

    pets = [
        Dog("Buddy", 3, owner1),
        Cat("Whiskers", 2, owner2),
    ]

    for pet in pets:
        print(pet.show_info())
        print("Sound:", pet.make_sound())
        if isinstance(pet, Dog):
            print(pet.fetch())
        elif isinstance(pet, Cat):
            print(pet.scratch())
        print("-" * 30)


if __name__ == "__main__":
    main()
