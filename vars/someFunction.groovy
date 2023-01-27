def call(input){
    echo "sent ${input}"
    thenThis("other file");
    thenThis.thenThisOtherFunction("subfunction");
}

def someOtherFunction(input) {
    echo "someOtherFunction ${input}"
}
