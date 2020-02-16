Snake.prototype.snakeMove = function (food, map) {
    //蛇身体
    for (var i = this.body.length - 1; i > 0; i--) {
        this.body[i].x = this.body[i - 1].x;
        this.body[i].y = this.body[i - 1].y;
    }
    //蛇头的移动
    switch (this.direction) {
        case 'right' :  this.body[0].x++;break;
        case 'left' :   this.body[0].x--;break;
        case 'top' :    this.body[0].y--;break;
        case 'bottom' : this.body[0].y++;break;
    }

    //---------------------吃食物长身体-------------------------------
    var snakeHeaderX = this.body[0].x * this.width;
    var snakeHeaderY = this.body[0].y * this.height;
    var foodX = food.x;
    var foodY = food.y;
    if (snakeHeaderX == food.x && snakeHeaderY == food.y) {
        this.body.push({
            x: this.body[this.body.length - 1].x,
            y: this.body[this.body.length - 1].y,
            bgColor: getColorForRandom()
        })
        food.render(map);
    }
}
