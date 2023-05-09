const express = require('express');
const { request } = require('http');
const app = express();

app.use((request, response, next)) => {
    console.log(request.headers)
    next()
}

app.use((request, response, next)) => {
    request.chance = Math.random()
    next()
}

app.get('/')


