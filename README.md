# java-runewords-api

Java RESTful API for saving information about runewords in Diablo 2 and related games. Developed during DIO's Santander Bootcamp 2023 FullStack Java+Angular.

## Class Diagram

```mermaid
classDiagram
    class Runeword {
        name: String
        rune: Array<String>
        equipment: Array<String>
        level: Integer
        attribute: Array<String>
    }

    class Rune {
        icon: String
        name: String
    }

    class Equipment {
        name: String
    }

    class Attribute {
        description: String
    }

    Runeword "1"-->"*" Rune : have
    Runeword "1"-->"*" Equipment : equipable
    Runeword "1"-->"*" Attribute : have
```