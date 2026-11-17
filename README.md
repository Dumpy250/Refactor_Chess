# Refactor_Chess

A small Java console board-manipulation exercise. The source credits **Cameron Basham — Programming 101, Coding Assignment 9**. It initializes and prints a chess-like board, accepts a piece token and destination coordinates, then prints the changed board once.

**This is not a complete chess game:** the operation overwrites one array cell; it does not validate a move or remove the original piece.

## Files and entrypoint

- `Chess.java` — public class **`Chess`**, no package declaration; contains `main` and `initializeBoard`.
- `.gitattributes` — Git file-handling metadata.

No external libraries, build manifest or automated tests are supplied. A JDK with `javac` and `java` is required; no Java version or tested minimum is declared.

## Source-checked usage

These PowerShell instructions are **unexecuted**. From the repository root:

```powershell
New-Item -ItemType Directory -Force -Path .readme-build | Out-Null
javac -d .readme-build Chess.java
```

After compilation succeeds:

```powershell
java -cp .readme-build Chess
```

Compilation writes class files; running opens a console interaction. Keep temporary build output out of commits.

The program asks for a piece token, then a row and column. Array indices are **0–7**, but the code does not enforce that range or verify that the token names an existing piece. It assigns the token directly to the destination cell, prints the board and exits; there is no repeating turn loop.

## Limitations

- No legal-move rules, player turns, check/checkmate, capture validation or graphical interface.
- The original piece remains in place; destination contents are overwritten without validation.
- Pawn labels repeat on both sides, so tokens are not unique piece identifiers.
- Nonnumeric or out-of-range coordinates can terminate the program with an exception. No file-based game saving or verified gameplay results are provided.
