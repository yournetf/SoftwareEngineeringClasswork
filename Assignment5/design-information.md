1. A grocery list consists of items the users want to buy at a grocery store. The application
must allow users to add items to a list, delete items from a list, and change the quantity
of items in the list (e.g., change from one to two pounds of apples).

This was implemented with the class "GroceryList" and its methods:
+addItem(Item: item)
+deleteItem(Item: item)
+setQuantity(Item: newItem, Quantity: newQuantity)
------------------------------------------------------------------------------------------------
2. The application must contain a database (DB) of items and corresponding item types.

The database(DB) is represented by the cylindrical-prism labeled, "Database of items and corresponding item types".
------------------------------------------------------------------------------------------------
3. Users must be able to add items to a list by picking them from a hierarchical list, where
the first level is the item type (e.g., cereal), and the second level is the name of the
actual item (e.g., shredded wheat). After adding an item, users must be able to specify a
quantity for that item.

Item type selection and actual item selection are handled by the methods within the "Search" class:
+searchItemsByType(type:name) returns List<Item>
+searchItemsByName(name: String) returns List<Item>;
Respectively.
The selected item is then added to the a specified GroceryList with the method:
+addItemsToList(GroceryList: String, Item:item)
From here, the GroceryList will give the user the ability to change the quantity of this item with:
+setQuantity(name:String, quantity: int)
------------------------------------------------------------------------------------------------
4. Users must also be able to specify an item by typing its name. In this case, the
application must look in its DB for items with similar names and ask the users, for each
of them, whether that is the item they intended to add. If a match cannot be found, the
application must ask the user to select a type for the item and then save the new item,
together with its type, in its DB.

The "Search" class also has methods for searching by name:
+searchItemsByName(name: String) returns List<Item>
If (returns empty list) calls +addItem(Item: item, type: String), to ask if the user wants to add an item to the db
Else if(returns item(s)) calls +addItemsToList(GroceryList: String, Item:item), to ask if the user wants to add an item to a specific list.
------------------------------------------------------------------------------------------------
5. Lists must be saved automatically and immediately after they are modified.

Implemented with the +saveList() method in "GroceryList". It is called within every other method in "GroceryList".
------------------------------------------------------------------------------------------------
6. Users must be able to check off items in a list (without deleting them).

This is implemented in both the "Item" and "GroceryList" classes.
In the "item" class, we have the method:
+isCheckedOff(checkedOff:boolean) <----- Constructor
In the "GroceryList" class, we have the method:
+checkOffItem(name:String)
------------------------------------------------------------------------------------------------
7. Users must also be able to clear all the check-off marks in a list at once.

In the "GroceryList" class, we have the method:
+clearAllCheckOffMarks()
------------------------------------------------------------------------------------------------
8. Check-off marks for a list are persistent and must also be saved immediately.

Check off marks are also saved with the +saveList() method in the "GroceryList" class. This method is called within every other method in "GroceryList".
------------------------------------------------------------------------------------------------
9. The application must present the items in a list grouped by type, so as to allow users to
shop for a specific type of products at once (i.e., without having to go back and forth
between aisles).

Each "GroceryList" instance will have access to the function +changeSelectedType(), which will create a new list to be temporarily displayed.
This list will only house items of a specified type.
------------------------------------------------------------------------------------------------
10. The application must support multiple lists at a time (e.g., “weekly grocery list”, “monthly
farmer’s market list”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete lists.

The "GroceryBook" class uses a list of "GroceryList" instances in order to create grocery lists that can be cycled through.
The methods:
+createList(name: String)
+renameList(previousName: String, newName: String)
+selectList(name: String)
+deleteList(name: String),
allow for creation, renaming, selection, and deletion of these grocery lists respectively.
------------------------------------------------------------------------------------------------
11. The User Interface (UI) must be intuitive and responsive.

The User Interface will be curated, to fulfill the intention of the application with beautiful, interactive, and functioning designs. 
