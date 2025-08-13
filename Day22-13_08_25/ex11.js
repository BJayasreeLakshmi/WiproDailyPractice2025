function findDayOfWeek() {
    const date = new Date(2030, 7, 13);

    const days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    const dayName = days[date.getDay()];

    console.log("13th August 2030 will be a " + dayName);
}

findDayOfWeek();