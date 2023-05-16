const express = require('express');
const app = express();
const port = 4000;

app.get('/', (req, res) => {
    res.send('Sou uma aplicação Express');
    res.status = 200;
    });


app.use((req, res, next) => {
    req.currentDate = new Date();
    next();
});

app.get('/date', (req, res) => {
    const currentDate = req.currentDate
    res.send(`Data atual: ${currentDate}`);;
});

app.use((req, res, next) => {
    const currentDate = req.currentDate;
    const isoDate = currentDate.toISOString();
    req.currentDateISO = isoDate;
    next();
    });

app.get('/agora', (req, res) => {
    const currentDateISO = req.currentDateISO;
    res.status(200).type('text/plain').send(currentDateISO);

});




    app.listen(port,() => console.log(`list on ${port}`));