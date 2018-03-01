1. How many times Oscar Wilde is saved in the directory if test() is executed?

Only one, because of the HashMap, the "hash" method of the String is used to compare if that String is already being used as a key in the map.

2. Having multiples instances of Interview class and being test() executed in a
multi-threading environment. Is it possible to have an scenario where “Oscar Wilde 2”
overwrites “Oscar Wilde” in the map?

No, not the scenario where “Oscar Wilde 2” overwrites “Oscar Wilde”, because of the order the values are added, the map will always have the value “Oscar Wilde” first, and therefore the value "Oscar Wilde 2" wont be added to the map, because the hash of the key will already exists in the map. But the opposite can happen. Where the value “Oscar Wilde” overwrites the value “Oscar Wilde 2”.

Let's say we have thread T1 and thread T2. If T1 executes first and tests for the key in the hash map, and the key is not present. Then the T2 is executed, and for some reason, it is able to execute all the "put" method calls and add all the values to the map. Then T1 comes back and puts the value “Oscar Wilde” into the map, replacing the previous value that was “Oscar Wilde 2”.

3. Converting authorDirectory map into a static field, will it make recordAuthorData()
thread-safe?

No. It will only make it worst. Or more susceptible to errors. Because static fields are shared among all the instances of a class, which means that even if we had more instances of the Interview class, all the instances will be sharing the same "authorDirectory" variable.

4. If not, make recordAuthorData() ​thread-safe without use synchronization​. If yes,
please explain why.

We can use ConcurrentHashMap instead of HashMap. This implementation is thread-safe. It's fast for multiple reads and the writes are managed internally by a lock.

