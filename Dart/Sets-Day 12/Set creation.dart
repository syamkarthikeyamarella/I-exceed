void main() 
{
  // 1. Set Literal
  var fruits = {"Apple", "Banana", "Mango"};
  print("1. Set Literal: $fruits");

  // 2. Set Constructor
  var set1 = Set();
  set1.add(10);
  set1.add(20);
  set1.add(30);
  set1.add("Hi");
  print("2. Set Constructor: $set1");

  // 3. Set.of()
  var uniqueNumbers = Set.of([1, 2, 2, 3, 4]);
  print("3. Set.of(): $uniqueNumbers");

  // 4. Set.from()
  var uniqueFruits = Set.from(["Apple", "Banana", "Apple", "Grapes", "Orange"]);
  print("4. Set.from(): $uniqueFruits");

  // 5. Set.unmodifiable()
  var fixedSet = Set.unmodifiable([1, 2, 3, 4, 5]);
  print("5. Set.unmodifiable(): $fixedSet");
  // fixedSet.add(4); // Uncommenting this will throw runtime error since the set is unmodifiable

  // 6. Empty Set
  var emptySet = <int> {}; //if you dont declare the datatype explicitly it will be taken as map
  print("6. Empty Set: $emptySet");
  print("Type of empty set: ${emptySet.runtimeType}");
}
