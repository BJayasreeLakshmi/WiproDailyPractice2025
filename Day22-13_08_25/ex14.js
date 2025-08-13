let cities = ["Mumbai", "Delhi", "Bangalore", "Chennai", "Kolkata", "Pune"];
console.log(cities);
    function populateCities() {
        let dropdown = document.getElementById("cityDropdown");

        let sortedCities = cities.sort();

        for (let i = 0; i < sortedCities.length; i++) {
            let option = document.createElement("option");
            option.text = sortedCities[i];
            option.value = sortedCities[i];
            dropdown.add(option);
        }
        dropdown.add(option);
    }