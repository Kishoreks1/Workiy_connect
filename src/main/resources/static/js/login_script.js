'use strict';
let currentIndex = 0;
const slides = document.querySelectorAll(".slide");
const dots = document.querySelectorAll(".dot");


function updateSlide() {
    slides.forEach((slide, index) => {
        slide.classList.toggle("active", index === currentIndex);
        dots[index].classList.toggle("active", index === currentIndex);
    });
}

function showNextSlide() {
    currentIndex = (currentIndex + 1) % slides.length;
    updateSlide();
}

updateSlide();

setInterval(showNextSlide, 4000);

dots.forEach((dot, index) => {
    dot.addEventListener("click", () => {
        currentIndex = index;
        updateSlide();
    });
})


