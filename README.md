# validify
This is a maven dependency to help you validate  in java including arrays, objects, emails , strings etc..
### Built in core java
### No other dependency used
### Simple API
### It works with java

#### Documentation

1. <a href="#isemail">`isEmail`</a>
2. <a href="#isInteger">`isInteger`</a>
3. <a href="#isString">`isString`</a>
4. <a href="#isURL">`isURL`</a>
5. <a href="#isEmail">`isEmail`</a>
6. <a href="#areEqual">`areEqual`</a>


``` ways to consume our APIS

 import the library first into your project
 
 
 import com.validfy.Validator

 Validator validator = new Validator();



### isEmail

 validator.isEMail("valensniyonsenga2003@gmail.com"); //true
 validator.isEMail("valensniyonsenga2003@.com"); //false



### isString


### isNumber

validator.isNumber(4545); //tue
validator.isNumber("4545"); //false


### isUrl


### areEqual

``` assume that you have a Person and Animal class in your project
 Person person = new Person("mugabo javis");
 Persorn person2 = new Person("mugabo javis");
 Person person1 = new Person("jhon doe");
 
 
 validator.areEquals(person, person2); //true
 validator.areEqual(person, person1); //false
 ```
 
 
 ### Maintainers

- [@valens200](https://github.com/valens200)




