def call(input){
    echo "default from mainFunction: ${input}"
    subFunction.doSomething("hello from mainFunction");

    entirelyDifferent.withMoreFunction("hellosi from mainFunction")
}
