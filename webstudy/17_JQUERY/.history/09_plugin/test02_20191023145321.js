$.fn.comma = function () {
    // console.dir(this);
    this.keyup(function () {
        this.value = 'aaa';
        console.log($(this).val());
    });
};

