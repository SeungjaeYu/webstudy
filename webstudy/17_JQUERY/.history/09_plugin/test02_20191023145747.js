$.fn.comma = function () {
    // console.dir(this);
    this.keyup(function () {
        this.value = this.value.replace(/,/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    });
};

