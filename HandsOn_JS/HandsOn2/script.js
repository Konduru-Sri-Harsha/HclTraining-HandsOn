const eventarray = [];
function addEvent() {
    
    let eventname = document.getElementById("eventName").value;
    if (eventarray.length === 0) {
        eventarray.push(eventname);
        document.getElementById("successMessage").innerHTML = "Event name added successfully";

    }
   
     else {
        let count = 0;
        for (let i = 0; i < eventarray.length; i++) {

            if (eventarray[i] === eventname)
                count++;

        }

        if (count > 0)
            document.getElementById("successMessage").innerHTML = "Event name alreadt exists. Try with some other name";
        else {
            eventarray.push(eventname);
            document.getElementById("successMessage").innerHTML = "Event name added successfully";

        } 
    }
    document.getElementById("eventName").value=""; 
   
} 

function displayEvent() {
    eventarray.sort();
    document.getElementById("successMessage").innerHTML ="";
    document.getElementById("resultList").innerHTML="<h3>The Event name after sorting is </h3>";
    for (let k = 0; k < eventarray.length; k++) {
        document.getElementById("resultList").innerHTML += " <li> " + eventarray[k] + " </li>"
      
    }
}