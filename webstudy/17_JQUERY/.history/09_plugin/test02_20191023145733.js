$.fn.comma = function () {
    // console.dir(this);
    this.keyup(function () {
        this.value = this.value.replace(",", "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    });
};

