import pygame
import random
pygame.init()

class Visualizer():
    BLACK = 0,0,0

    GREYDIENT = [ # Puns = good code
        (128, 128, 128),
        (160, 160, 160),
        (190, 190, 190),
    ] 
    RED = 255, 0, 0
    WHITE = 255, 255, 255
    GREEN = 0, 255, 0
    BACKGROUND_COLOR = WHITE

    MENU_HEIGHT = 150
    BUFFER = 75

    def __init__(self, width, height, list):
        self.width = width
        self.height = height
        self.window = pygame.display.set_mode((width, height)) # Initialize a window or screen for display
        pygame.display.set_caption('Sorting Algorith Viewer')
        self.set_list(list)

    def set_list(self, list):
        self.list = list
        self.max_val = max(list)
        self.min_val = min(list)
        self.height_range = self.max_val - self.min_val

        self.bar_width = (self.width - self.BUFFER) / len(list) # Make bars fit the screen well
        self.bar_height = round((self.height - self.MENU_HEIGHT) / self.height_range)
        self.start_x = self.BUFFER // 2

def window_maker(window_info):
    window_info.window.fill(window_info.BACKGROUND_COLOR)
    pygame.display.update()

def draw_list(draw_info):
    pass


def list_maker(num_of_bars, min_val , max_val):
    list = []
    for number in range(num_of_bars):
        list.append(random.randint(min_val, max_val))

    return list

def main():
    running = True
    clock = pygame.time.Clock()
    fps = 60
    num_of_bars = 25
    min_val = 10
    max_val = 250
    list = list_maker(num_of_bars, min_val, max_val)
    window_info = Visualizer(800,600, list)
    window_maker(window_info)

    while running:
        clock.tick(fps)
        pygame.display.update() #render the display
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
    pygame.quit()

if __name__ == '__main__':
    main()

