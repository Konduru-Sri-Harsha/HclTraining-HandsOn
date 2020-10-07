const eventarray = [];
function pushElements() {

    let eventname = document.getElementById("input").value;
    if (eventarray.length === 0) {
        eventarray.push(eventname);
        document.getElementById("events").innerHTML = "Event name added successfully";

    }

    else {
        let count = 0;
        for (let i = 0; i < eventarray.length; i++) {

            if (eventarray[i] === eventname)
                count++;

        }

        if (count > 0)
            document.getElementById("events").innerHTML = "Event name alreadt exists. Try with some other name";
        else {
            eventarray.push(eventname);
            document.getElementById("events").innerHTML = "Event name added successfully";

        }
    }
    document.getElementById("input").value = "";

}

function popElements() {
    let lastElement = eventarray.pop(eventarray.length - 1);

    if (lastElement === undefined) {
        document.getElementById("events").innerHTML = "Event array is empty";

    }
    else {
        document.getElementById("events").innerHTML = "Removed Successfully";
    }

}
function display() {
    document.getElementById("events").innerHTML = "<h2>Events List</h2>"+"<ul>";
    for (let i = 0; i < eventarray.length; i++) {
        document.getElementById("events").innerHTML += "<li>" + eventarray[i] + "</li>";
    } document.getElementById("events").innerHTML += "</ul>";


}
