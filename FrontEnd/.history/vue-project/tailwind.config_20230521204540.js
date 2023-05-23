/** @type {import('tailwindcss').Config} */
module.exports = {
    daisyui: {
      themes: [
        {
          mytheme: {
          
              "primary": "#1D0027",
                      
              "secondary": "#A181E2",
                      
              "accent": "#37CDBE",
                      
              "neutral": "#D9D9D9",
                      
              "base-100": "#EDE6FA",            
                      
              "info": "#3ABFF8",
                      
              "success": "#36D399",
                      
              "warning": "#FBBD23",
                      
              "error": "#F87272",
          },
        },
      ],
    },
    content: ["./index.html","./src/**/*.{vue,js,ts,jsx,tsx}"],
    theme: {
      extend: {},
    },
    plugins: [require("daisyui")],
  }
  