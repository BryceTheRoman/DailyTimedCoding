﻿using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class GradingStudents
{

    static int[] solve(int[] grades)
    {
        for (int i = 0; i < grades.Length; i++)
        {
            if ((grades[i] <= 35) || (grades[i] % 5 == 0))
            {
                grades[i] = grades[i];
            }
            else if (grades[i] % 5 >= 3)
            {
                grades[i] = (((grades[i] % 5) - 5) * -1) + grades[i];
            }
        }
        return grades;
    }

    static void Main(String[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++)
        {
            grades[grades_i] = Convert.ToInt32(Console.ReadLine());
        }
        int[] result = solve(grades);
        Console.WriteLine(String.Join("\n", result));


    }
}
