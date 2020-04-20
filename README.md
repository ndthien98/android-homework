# Hackathon 20/04/2020
## Todo List Application 
1. Main function
- Add a note with title, content, and tag.
- View list all note created.

2. Optional 
- Edit note created.
- Delete note created.

3. UI Sample 
![UI](./todo-ui.png)

4. Database Model Description:
A table with 5 columns <br>

`id : INTEGER` - contain the unique id of each note 

`title : TEXT` - contain the title of note

`content : TEXT` - contain the content of the note

`tag : TEXT` - tag of the note, all available tags are HOME, FAMILY, WORK, DEFAULT. Each note has a tag which define background color for the note. Do not use any tag else.

`showtime : DATETIME` - reminder the user at this time. 

Create database by execute this SQL statement

```sql
DROP TABLE IF EXISTS "todo";
CREATE TABLE "main"."todo" (
  "id" INTEGER NOT NULL,
  "title" TEXT NOT NULL,
  "content" TEXT,
  "tag" TEXT NOT NULL,
  "showtime" DATETIME NOT NULL,
  PRIMARY KEY ("id")
);
```
<br>
In case you are not familiar with SQLite, you can use this file with executed table 
<br>
![todo.db](https://github.com/ndthien98/android-homework/blob/master/todo.db) 
<br>
5. Color <br>
Each tag come with a tag color

- Title text color: 
![#242424](https://placehold.it/20/242424/000000?text=+) `#242424`

- Content text color:
![#545454](https://placehold.it/20/545454/000000?text=+) `#545454`

- HOME tag color:
![#a5e830](https://placehold.it/20/a5e830/000000?text=+) `#a5e830`

- FAMILY tag color:
![#30c9e8](https://placehold.it/20/30c9e8/000000?text=+) `#30c9e8`

- WORK tag color:
![#8930e8](https://placehold.it/20/8930e8/000000?text=+) `#8930e8`

- DEFAULT tag color:
![#e88c30](https://placehold.it/20/e88c30/000000?text=+) `#e88c30`

- Background color: 
![#F7F7F7](https://placehold.it/20/F7F7F7/000000?text=+) `#F7F7F7`

- Primary  color:
![#e88c30](https://placehold.it/20/e88c30/000000?text=+) `#e88c30`

- Primary dark color:
![#915110](https://placehold.it/20/915110/000000?text=+) `#915110`

- Accent color: 
![#16a9c7](https://placehold.it/20/16a9c7/000000?text=+) `#16a9c7`

