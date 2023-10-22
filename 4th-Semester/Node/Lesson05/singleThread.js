console.log('This is a single thread!');

let i = 0;
setInterval(function() {
    //console.log(`I'm alive!`);
    console.log(i);
    i++;

    if(i===5) {
        console.log('Forcing an error');
        let a = i + z;
    }
}, 1000);

console.log('2nd instruction');