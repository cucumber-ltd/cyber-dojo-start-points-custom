using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Shouty
{
    public class Coordinate
    {
        private readonly int xCoord;
        private readonly int yCoord;

        public Coordinate(int xCoord, int yCoord)
        {
            this.xCoord = xCoord;
            this.yCoord = yCoord;
        }

        public int DistanceFrom(Coordinate other)
        {
//         TODO: actually calculate distance. I think we need to use pythagoras' theorem?
            return 0;

//            int xDiff = xCoord - other.xCoord;
//            int yDiff = yCoord - other.yCoord;

//            return (int) Math.Sqrt(Math.Pow(xDiff, 2) + Math.Pow(yDiff, 2));

        }
    }
}